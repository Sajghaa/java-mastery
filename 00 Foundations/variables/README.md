# Variables in Java – Mastery Module

## 🎯 Objective
Understand the **complete variable landscape** in Java – from primitive bits to memory footprints, from basic declarations to JVM‑level optimisations. By the end of this module, you will write **type‑safe, memory‑conscious, and performant** code.

---

## 📖 Theory in a Nutshell

### 1. Primitive Types (the 8 Guardians)
| Type   | Size  | Range / Precision               | Default |
|--------|-------|---------------------------------|---------|
| byte   | 1 B   | -128 … 127                      | 0       |
| short  | 2 B   | -32,768 … 32,767                | 0       |
| int    | 4 B   | -2³¹ … 2³¹-1                    | 0       |
| long   | 8 B   | -2⁶³ … 2⁶³-1 (suffix `L`)      | 0L      |
| float  | 4 B   | ±3.4e-38 … ±3.4e+38 (suffix `f`) | 0.0f    |
| double | 8 B   | ±1.7e-308 … ±1.7e+308          | 0.0d    |
| char   | 2 B   | 0 … 65,535 (Unicode)            | '\u0000'|
| boolean| 1 bit*| `true` or `false`               | false   |

> *boolean size is JVM‑dependent; often 1 byte in practice.

---

### 2. Reference Types
- **Classes, Interfaces, Arrays, Enums** – hold an address (pointer) to an object on the heap.
- Default value is `null`.

---

### 3. Variable Scopes (lifetime)
- **Local** – declared inside a method/block; exist only during execution.
- **Instance** – belong to an object; live as long as the object does.
- **Static** – belong to the class; live for the entire JVM lifetime.

---

### 4. Type Casting
- **Widening (implicit)** – `byte → short → int → long → float → double` (safe).
- **Narrowing (explicit)** – you must cast, risking data loss (e.g., `(int) 3.14` → `3`).

---

### 5. `var` – Local‑Variable Type Inference (Java 10+)
- The compiler infers the type from the initialiser.
- **Restrictions**: cannot use with `null`, lambdas, or without an initialiser.
- **Use wisely** – keep code readable, not cryptic.

---

### 6. `final` variables
- Cannot be reassigned (like `const` in other languages).
- For references, the **reference** is final, not the object’s state.

---

## 🧪 The Four Levels in `src/`

| Level      | Focus                                                                 |
|------------|-----------------------------------------------------------------------|
| **Beginner**  | Declaring primitives, literals, simple operations, basic scope.       |
| **Intermediate** | Widening/narrowing, overflow, `var` basics, default values.      |
| **Advanced**   | `var` with complex generics, effectively‑final, bitwise ops, enums.   |
| **Elite/Senior** | Memory layout (stack vs heap), object headers, cache lines, `@Contended`, primitive vs wrapper performance. |

---

## 🚀 How to Run
```bash
# Compile any level
javac src/beginner/VariableBasics.java
java src/beginner.VariableBasics

# (adjust package names if you add them)