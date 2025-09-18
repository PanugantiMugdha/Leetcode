# Optimal (O(1) space) approach — Theory

Compute sum of numbers and sum of squares from the grid.

Compare with the expected sum and expected sum of squares for 1..n².

Difference of sums → gives a - b.

Difference of squares → gives a² - b² = (a - b)(a + b).

From this, find a + b.

Solve the two equations:

a - b (known)

a + b (known)
→ gives a (repeated) and b (missing).

Complexity: O(n²) time, O(1) space.
