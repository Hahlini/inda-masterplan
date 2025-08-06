 
import math
import numpy as np
import matplotlib.pyplot as plt

def drawScreen(x, y):
    y = int(y * 2.9)
    screen = []
    for i in range(x):
        screen.append([])
        for j in range(y):
            screen[i].append(".")
    return screen
    
def printScreen():
    for i in range(len(screen)):
        for j in range(len(screen[0])):
            print(screen[i][j], end="")
        print()

def distance(x, y, xTarget, yTarget):
    return math.sqrt((x- xTarget)*(x- xTarget) + (y- yTarget)*(y- yTarget)* 0.18)


def drawCircle(radius, x, y):
    for i in range(len(screen)):
        for j in range(len(screen[0])):
            if distance(x, y, i, j) < radius:
                screen[i][j] = "#"


screen = drawScreen(30,30)
drawCircle(5.3, 7, 15)
drawCircle(5.3, 19, 15)
for i in range(17, 70):
    drawCircle(3.3, 13, i)
printScreen()

def f(t):
    return np.sin(2* t) + 2 * t / 5

t1 = np.arange(0.0, 10.0, 0.1)
t2 = np.arange(0.0, 10.0, 0.02)

plt.figure()
plt.subplot(311)
plt.plot(t2, f(t2), 'b')

plt.subplot(312)
plt.plot(t2, 3 * t2 /(t2+1), 'r')

plt.subplot(313)
plt.plot(t2, 3 * t2 /(t2+1), 'r',t2, f(t2), 'b')
plt.show()