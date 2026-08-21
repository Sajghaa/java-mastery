# Operators in Java – Mastery Module

## 🎯 Objective
Operators are the **verbs** of the Java language. This module covers everything from basic arithmetic to bit-twiddling, short-circuit logic, and even JIT-level optimisations. 

---

## 📖 Theory in a Nutshell

### 1. Categorisation
| Category           | Operators                                                                 |
|--------------------|---------------------------------------------------------------------------|
| **Arithmetic**     | `+`, `-`, `*`, `/`, `%` (modulo)                                          |
| **Relational**     | `==`, `!=`, `>`, `<`, `>=`, `<=`                                          |
| **Logical**        | `&&` (short-circuit AND), `||` (short-circuit OR), `!`                    |
| **Bitwise**        | `&` (AND), `|` (OR), `^` (XOR), `~` (complement), `<<`, `>>`, `>>>`      |
| **Assignment**     | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `<<=`, `>>=`, `>>>=`|
| **Unary**          | `+`, `-`, `++`, `--`, `!`                                                 |
| **Ternary**        | `? :`                                                                     |
| **Instanceof**     | `instanceof`                                                              |

---

### 2. Critical Gotchas (Beast Mode Warning ⚠️)
- **Integer Division** – `10 / 3` = `3` (truncates). Use `10.0 / 3` for `3.333…`.
- **Modulo with Negatives** – `-10 % 3` = `-1` (sign follows dividend).
- **Short-Circuit** – `&&` and `||` skip evaluation of the right operand if the left already decides the result.
- **Type Promotion** – In binary operations, `byte`, `short`, and `char` are promoted to `int` before evaluation.
- **Compound Assignment** – `b += 5` performs an implicit cast: `b = (byte)(b + 5)` – so it compiles even if `b + 5` overflows `byte`.
- **Shift Operators** – `<<` (left, fills with 0), `>>` (signed right, preserves sign bit), `>>>` (unsigned right, fills with 0).

---

### 3. Precedence (Highest → Lowest)
1. Postfix: `expr++`, `expr--`
2. Unary: `++expr`, `--expr`, `+`, `-`, `~`, `!`
3. Multiplicative: `*`, `/`, `%`
4. Additive: `+`, `-`
5. Shift: `<<`, `>>`, `>>>`
6. Relational: `<`, `>`, `<=`, `>=`, `instanceof`
7. Equality: `==`, `!=`
8. Bitwise AND: `&`
9. Bitwise XOR: `^`
10. Bitwise OR: `|`
11. Logical AND: `&&`
12. Logical OR: `||`
13. Ternary: `? :`
14. Assignment: `=`, `+=`, etc.

> 💡 *When in doubt, use parentheses – it costs nothing and saves debugging hours.*

---

## 🧪 The Four Levels in `src/`

| Level      | Focus                                                                 |
|------------|-----------------------------------------------------------------------|
| **Beginner**  | Arithmetic, relational, basic logical operators, simple assignments.  |
| **Intermediate** | Precedence, type promotion, compound assignments, ternary operator. |
| **Advanced**   | Bitwise operations, shifts, non-short-circuit `&`/`\|` vs short-circuit, `instanceof`. |
| **Elite/Senior** | JIT optimisations (strength reduction), overflow detection, branchless math, performance of `%` vs `&` for powers of two. |

---

## 🚀 How to Run
```bash
javac src/beginner/ArithmeticAndRelational.java
java src/beginner.ArithmeticAndRelational