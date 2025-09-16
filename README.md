# Fall25JavaPerson
Java Classes

## Person Class

The `Person` class models a simple person with a name and age. It provides constructors, accessors, mutators, and utility methods to manage its state.

### Fields

- **name** (`String`): The person's name.
- **age** (`int`): The person's age (must be non-negative).

### Constructors

- **Person()**
  - Creates a new `Person` with default values: name = "John", age = 21.

- **Person(String name, int age)**
  - Creates a new `Person` with the specified name and age.
  - If the age is negative, it defaults to 0.

### Methods

- **getName()**: Returns the person's name.
- **setName(String name)**: Sets the person's name.
- **getAge()**: Returns the person's age.
- **setAge(int age)**: Sets the person's age if it is non-negative.
- **haveBirthday()**: Increments the person's age by one.
- **toString()**: Returns a string representation of the person in the format:
  ```
  Person {
      Name: [name]
      Age: [age]
  }
  ```
- **isValidAge(int age)** (private): Helper method to check if an age is valid (0 or greater).

### Example Usage

```java
Person one = new Person();
Person two = new Person("Sue", 50);
Person three = new Person("Mark", -42); // age defaults to 0

one.setName("Tom");
one.setAge(42);

System.out.println(one); // Outputs: Person { Name: Tom Age: 42 }
two.haveBirthday();
System.out.println(two.getAge()); // Outputs: 51
```

The class includes input validation for age and demonstrates encapsulation by keeping fields private and exposing public methods for interaction.