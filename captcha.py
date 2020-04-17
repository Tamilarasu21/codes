import random  #import module
a=random.randint(0,10)
b=random.randint(0,10)

c=random.choice(["+","-","*"])

print('Solve this captcha')

print(a,c,b,"=")

d=int(input("answer for the above captcha : "))

#perform operations based on operand
if c=="+":
   e=a+b
elif c=="-":
    e=a-b
elif c=="*":
    e=a*b

#verify user's answer and correct answer
if d == e:
    print("\n Correct")
else:
    print("\n Wrong!")
