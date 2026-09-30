# # import math
# #
# # x = 5.75
# #
# # # приводим угол к [-pi/2, pi/2]
# # x = x - 2 * math.pi
# #
# # s = 0
# # k = 0
# # 0
# # while True:
# #     term = (-1) ** k * x ** (2 * k + 1) / math.factorial(2 * k + 1)
# #
# #     if abs(term) < 1e-6:
# #         break
# #
# #     s += term
# #     k += 1
# #
# # print("Приведенный угол:", x)
# # print("sin(x) =", s)
# # print("Количество членов:", k)
# # print("Погрешность:", abs(s - math.sin(5.75)))
#
#
# import math
#
# x = 0.38
# eps = 1e-8
#
# t = 1
# s = 1
# k = 0
# n = 1
#
# while True:
#     t = -t * x ** 2 / ((2 * k + 1) * (2 * k + 2))
#
#     if abs(t) < eps:
#         break
#
#     s += t
#     n += 1
#     k += 1
#
# print("cos(x) =", s)
# print("Количество членов:", n)
# print("Погрешность:", abs(s - math.cos(x)))



import math

t = 0.31
eps = 1e-8

# e^t
term = 1
e = 1
k = 0
n_e = 1

while True:
    k += 1
    term = term * t / k

    if abs(term) < eps:
        break

    e += term
    n_e += 1

# cos(t)
term = 1
c = 1
k = 0
n_c = 1

while True:
    k += 1
    term = -term * t * t / ((2 * k - 1) * (2 * k))

    if abs(term) < eps:
        break

    c += term
    n_c += 1

F = e * c
exact = math.exp(t) * math.cos(t)

print("F(t) =", F)
print("Членов для e^t:", n_e)
print("Членов для cos(t):", n_c)
print("Погрешность:", abs(F - exact))
