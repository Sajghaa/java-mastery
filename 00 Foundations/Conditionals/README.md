# Conditionals in Java – Clean Code Mastery

## 🎯 Objective
Conditionals are the **decision-makers** in your code. Most bugs come from poorly structured conditionals. This  teaches how to write conditionals that are **clear, maintainable, and self-documenting**.

## 📖 Theory: The Clean Code Philosophy

### 1. `if-else` (The Workhorse)
- **Rule**: Keep it shallow. Deep nesting is a code smell.
- **Rule**: Use **Guard Clauses** (early `return`) to flatten `if-else`.
- **Rule**: Always put the **happy path** first. Handle edge cases early.

### 2. `switch` (Classic vs Modern)
- **Classic** (`case X: break;`) → Works with `int`, `char`, `String`, `enum`.
- **Modern** (Java 14+) → Arrow syntax `->`, no fall-through, returns values.
- **Rule**: Use `switch` when you have 3+ discrete values. Use `if-else` for ranges.

### 3. Ternary Operator (`? :`)
- **Rule**: Only use for **simple assignments**. Never nest ternaries.
- **Rule**: If it spans more than 80 characters, use `if-else`.

### 4. Pattern Matching (Java 21+)
- **Rule**: Use when checking types + extracting data in one go.
- **Rule**: Prefer pattern matching over `instanceof` + cast.

### 5. Boolean Blindness (Elite Concept)
- **Rule**: Avoid `boolean` parameters that change behavior. Use enums instead.
- **Example**: `calculatePrice(order, true)` → What does `true` mean? `calculatePrice(order, DiscountType.STUDENT)` is self-documenting.

## 🧪 The Four Levels

| Level      | Focus                                                                 |
|------------|-----------------------------------------------------------------------|
| **Beginner**  | Basic `if-else`, `switch` (classic), avoiding deep nesting.           |
| **Intermediate** | Guard clauses, `switch` expressions, ternary operator.            |
| **Advanced**   | Pattern matching, clean refactoring, enum-based conditionals.        |
| **Elite/Senior** | Bytecode analysis, refactoring into polymorphism, boolean blindness. |

---