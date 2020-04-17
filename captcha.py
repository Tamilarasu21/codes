import random
a=random.randint(1,11)
b=random.randint(1,11)

c=random.choice(["+","-","*"])

print(a,c,b,"=")


d=int(input("enter the captcha : "))


if c=="+":
   e=a+b
elif c=="-":
    e=a-b
else:
    e=a*b

print(e)

if d == e:
    print("welcome")
else:
    print("sorry")
