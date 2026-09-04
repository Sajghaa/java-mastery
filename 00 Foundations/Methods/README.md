# Methods in Java – Clean Code Mastery

## 🎯 Objective
Methods are the **verbs** of your code. They encapsulate behavior, promote reuse, and make your code **testable**. This  teaches how to write methods that are **clear, focused, and self-documenting**.

## 📖 Theory: The Clean Code Philosophy

### 1. Method Naming
- **Rule**: Method names should be **verbs** or **verb phrases**.
- **Good**: `calculateTotal()`, `getUser()`, `processPayment()`
- **Bad**: `total()`, `user()`, `payment()`

### 2. Single Responsibility
- **Rule**: A method should do **one thing** and do it well.
- **Good**: `validateEmail()` does only email validation.
- **Bad**: `validateEmailAndSendConfirmation()` does two things.

### 3. Parameter Count
- **Rule**: 0-3 parameters is ideal. More than 3 is a code smell.
- **Fix**: Use a `Builder` or `DTO` (Data Transfer Object) for many parameters.

### 4. Return Types
- **Rule**: Return `Optional<T>` for nullable values (instead of `null`).
- **Rule**: Don't return `null` if you can avoid it (use `Optional` or throw exception).

### 5. Side Effects
- **Rule**: Avoid modifying external state unless the method name implies it.
- **Good**: `calculateTax()` → Returns a value, no side effects.
- **Bad**: `calculateTaxAndUpdateDatabase()` → Does two things with side effects.

## 🧪 The Four Levels

| Level      | Focus                                                                 |
|------------|-----------------------------------------------------------------------|
| **Beginner**  | Syntax, parameters, return types, overloading.                        |
| **Intermediate** | Static vs instance, varargs, method chaining, recursion.          |
| **Advanced**   | Clean design, SRP, method references, functional interfaces.          |
| **Elite/Senior** | JVM internals, inlining, performance, invoke dynamic.              |

## 🚀 How to Run
```bash
javac src/beginner/MethodBasics.java
java src.beginner.MethodBasics