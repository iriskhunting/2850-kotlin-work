// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.filter { it.status == ItemStatus.NotStarted }.size // compute no. of items with NotStarted status
    val inProgress get() = items.filter { it.status == ItemStatus.InProgress }.size   // compute no. of items with InProgress status
    val done get() = items.filter { it.status == ItemStatus.Done }.size         // compute no. of items with Done status
    val overdue get() = items.filter { it.isOverdue() }.size     // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        val filePath = Path(filename)
        filePath.forEachLine {
            // Parse through csv, make each line into ToDoItem and add to items
            val props = it.split(": ")
            val item = ToDoItem(LocalDate.parse(props[0]), ItemStatus.valueOf(props[1]), props[2])
            add(item)
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        return items.removeAll { it.status == ItemStatus.Done }
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null

        when (status) {
            null                  -> return items
            ItemStatus.NotStarted -> return items.filter { it.status == ItemStatus.NotStarted }
            ItemStatus.InProgress -> return items.filter { it.status == ItemStatus.InProgress }
            ItemStatus.Done       -> return items.filter { it.status == ItemStatus.Done }
        }

        return emptyList()
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date

        if (items.any { it.dueDate == date }) {
            return items.filter { it.dueDate == date }
        }
        else {
            return emptyList()
        }
    }
}
