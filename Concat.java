public class Concat {
    public static void main(String[] args) {
        String result = "";

        for (int i = 0; i < args.length; i++) {
            result += args[i];
            if (i < args.length - 1) {
                result += " ";
            }
        }

        System.out.println(result);
    }
}
I'll explain the logic of the code step by step:

```java
public static void addNumberAndPrint(int[] arr) {
    // Hardcoded number to add
    int numberToAdd = 5;

    // Start from the rightmost digit of the array
    for (int i = arr.length - 1; i >= 0; i--) {
        // Add the current number to the digit
        int sum = arr[i] + numberToAdd;
        
        // Update the current digit with the ones place of the sum
        arr[i] = sum % 10;
        
        // Update number to add (carry) with the tens place
        numberToAdd = sum / 10;
        
        // If no more carry, we can stop adding
        if (numberToAdd == 0) {
            break;
        }
    }
    
    // Handle case when there's still a carry after going through all digits
    if (numberToAdd > 0) {
        // Create a new array with an additional digit
        int[] newArr = new int[arr.length + 1];
        newArr[0] = numberToAdd;
        
        // Copy existing digits to the new array
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        
        // Print the new array
        printArray(newArr);
    } else {
        // Print the modified original array
        printArray(arr);
    }
}
```

Let's break down the logic with an example of adding 5 to `{9,9,9}`:

1. **Starting Point:**
   - Input array: `{9,9,9}`
   - Number to add: `5`

2. **First Iteration (rightmost digit):**
   - Current digit: `9`
   - Sum: `9 + 5 = 14`
   - Update digit: `14 % 10 = 4`  (ones place)
   - Carry: `14 / 10 = 1`  (tens place)
   - Array now: `{9,9,4}`
   - Carry is `1`

3. **Second Iteration (middle digit):**
   - Current digit: `9`
   - Sum: `9 + 1 = 10`
   - Update digit: `10 % 10 = 0`
   - Carry: `10 / 10 = 1`
   - Array now: `{9,0,4}`
   - Carry is `1`

4. **Third Iteration (leftmost digit):**
   - Current digit: `9`
   - Sum: `9 + 1 = 10`
   - Update digit: `10 % 10 = 0`
   - Carry: `10 / 10 = 1`
   - Array now: `{0,0,4}`
   - Carry is `1`

5. **Carry Handling:**
   - Since there's still a carry (`1`)
   - Create a new array with an extra digit
   - New array becomes: `{1,0,0,4}`

**Key Concepts:**
- `sum % 10`: Gets the ones place (remainder when divided by 10)
- `sum / 10`: Gets the tens place (integer division)
- Iterate from right to left to simulate manual addition
- Handle carry by propagating it to the next digit
- If carry remains after processing all digits, create a new array

**Modulo and Division Examples:**
- `14 % 10 = 4`  (remainder)
- `14 / 10 = 1`  (integer division)

This approach mimics how we manually add numbers, starting from the rightmost digit and carrying over when necessary.