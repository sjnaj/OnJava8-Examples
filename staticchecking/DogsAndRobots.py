# staticchecking/DogsAndRobots.py
# �2016 MindView LLC: see Copyright.txt
# We make no guarantees that this code is fit for any purpose.
# Visit http://mindviewinc.com/Books/OnJava/ for more book information.

def speak(anything):
    anything.talk()

class Dog:
    def talk(self):  System.out.println("Arf!")
    def reproduce(self): pass

class Robot:
    def talk(self): System.out.println("Click!")
    def oilChange(self): pass

a = Dog()
b = Robot()

speak(a)
speak(b)
