import math

x = 0.5 

sum = 0
numerator = 2
denominator = 2
sign = 1

for i in range(1, 11):
    term = (numerator * math.pow(2, i)) / math.factorial(denominator)
    sum += sign * term
    denominator += 2
    sign *= -1

print("Suma:", sum)
