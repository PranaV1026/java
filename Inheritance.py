class Animal:
    def __init__(self,name):
        self.name = name
    
    def speak(self):
        print("Unknown Sound")
        
class Dog(Animal):
    def speak(self):
        print("Woofff")
        
class Cat(Animal):
    def speak(self):
        print("Meowww")
        
doggy = Dog("Buddy")
doggy.speak()

kitty = Cat("Kitten")
kitty.speak()