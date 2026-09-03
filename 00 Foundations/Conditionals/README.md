# Conditionals in Java – Clean Code Mastery

## 🎯 Objective
Conditionals are the **decision-makers** in your code. Most bugs come from poorly structured conditionals. This  teaches howto write conditionals that are **clear, maintainable, and self-documenting**.

## 📂 Structure (One Concept Per File)

| File | Teaches |
| :--- | :--- |
| `IfElseBasics.java` | `if`, `if-else`, `if-else-if` chains (flat) |
| `SwitchBasics.java` | Traditional `switch` with `break` |
| `SwitchFallthrough.java` | Fall-through behavior (when it's useful, when it's dangerous) |
| `GuardClausesIntro.java` | Using early `return` to flatten nested `if-else` |
| `SwitchExpressions.java` | Modern `switch` with `->` and `yield` |
| `TernaryOperator.java` | When to use `? :` and when to avoid it |
| `GuardClausesDeep.java` | Advanced guard clause patterns |
| `EnumsWithBehavior.java` | Replacing conditionals with enum methods |
| `PatternMatching.java` | Pattern matching with `switch` (Java 21+) |
| `GuardedPatterns.java` | `when` clauses in pattern matching |
| `SealedHierarchy.java` | Exhaustive switches with sealed classes |
| `BooleanBlindness.java` | Why boolean params are evil (and what to use instead) |
| `TableswitchVsLookupswitch.java` | JVM bytecode performance |
| `PolymorphicRefactoring.java` | Strategy Pattern as a conditional replacement |

## 🧠 The Clean Code Philosophy

1. **Flatten your conditionals** – Deep nesting is a code smell.
2. **Use Guard Clauses** – Handle edge cases first, then the happy path.
3. **Prefer `switch` for 3+ discrete values** – It's more readable.
4. **Use `if-else` for ranges** – Scores, ages, etc.
5. **Avoid boolean parameters** – Use enums to make intent explicit.
6. **Pattern matching** – Cleaner than `instanceof` + cast.

## 🚀 How to Run
```bash
javac src/beginner/IfElseBasics.java
java src.beginner.IfElseBasics