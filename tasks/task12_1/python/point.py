# Task 12.1: Point class
import math

class Point:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self):
        return math.hypot(self.x, self.y)

    def distanceTo(self, p):
        return math.hypot((p.x - self.x), (p.y - self.y))


