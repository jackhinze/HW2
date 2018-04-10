# Problem 3:  Roman Numerals

You will be given one roman numeral, have your program determin if it is a valid roman numeral and calculate it's value.

The valid roman numerals (with their value in parentesis following them): I(1); V(5); X(10); L(50); C(100); D(500); M(1000)

Note that 'V', 'L', 'D' are called auxiliary Roman Numerals.

Example of a valid roman numeral MCMXCVIII = 1998

There are 2 rules to determin if you are adding or subtracting characters value: 
1. If a character is followed by one with an equal or smaller value than the current one, or it is the last one, you addit's value to the result.
2. If a character is followed by one with a greater value then you subtract the current characters value from the result.

Your program should print out the result of calculated value of the roman numeral.

There are a few reasons that it is not a valid roman numeral.  If one of these happens print out the error message instead of the result:
1. If there is a character that is not a valid character (from the list above)(ex. MCMHVII) then print out "Error: Not all characters are valid Roman Numerals."
2. If an auxiliary Symbol is used where we would subtract it's value (ex. LC), then print out "Error: Auxiliary symbols are not allowed to be subtracted in Roman Numerals."
3. If the sequence has two symbols next to each other that would subtract (IXD), then print out "Error: Subtraction of consecutive characters is not allowed."
4. If a symbol is added that has a value greater than any of hte previous additions (MCCM), then print out "Error: The value of symbols to be added must not increase as we work through the Roman Numeral."
