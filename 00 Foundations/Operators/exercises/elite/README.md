# Elite Exercises – Operators (Senior Level)

1. **Benchmarking Strength Reduction** – Write a JMH benchmark (or simple loop) comparing `i * 2` vs `i << 1` over 1 billion iterations. Run with `-XX:+PrintCompilation` and observe which method gets compiled and if they converge to similar performance.

2. **Safe Arithmetic Utility** – Write a utility class `SafeMath` with methods `addExact`, `subtractExact`, `multiplyExact` that throw an `ArithmeticException` on overflow without using `Math.addExact` (implement the check manually using bitwise/conditional logic).

3. **Fast Modulo for Negative Numbers** – Write a method `modPositive(int a, int b)` that returns a non-negative remainder (0 ≤ r < b) for any `a`, even negative. Compare performance with `Math.floorMod`.

4. **Branchless Clamping** – Given an `int value`, clamp it between `0` and `255` using **only bitwise/arithmetic operations** (no `if` or ternary). Hint: use `min` and `max` patterns with bit shifts.

5. **Order of Evaluation Exploit** – Write a single line of code that modifies an array index and the array element simultaneously (like `arr[++i] = i`). Explain how the Java evaluation order (left-to-right for `[]` and `=`) affects the outcome. Then, explain why this is considered a bad practice in production.