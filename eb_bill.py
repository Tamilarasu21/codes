"""
sanjay was shocked after seeing his electricity bill of may month.He approached TNEB office
and asked for more details.TNEB offocer explained about the tarrif rate and asked to calculate and
check.He was not able to calculate and asked his friend to help.His friend said it will be calculated
based on the Maximum unit.Help sanjay and his friend to calculate the amount ?
                        ____________________________________________
                        From unit  |  To unit  | Rate  |  Max.unit 
                        ____________________________________________
                            1      |    100    |   0   |   100
                        --------------------------------------------
                            1      |    100    |   0   |   200
                            101    |    200    |  1.5  |   200
                        --------------------------------------------
                            1      |      100  |   0   |   500
                            101    |      200  |   2   |   500
                            201    |      500  |   3   |   500
                        --------------------------------------------
                            1      |      100  |   0   |   9999999
                            101    |      200  |  3.5  |   9999999
                            201    |      500  |  4.6  |   9999999
                            301    |    Above  |  6.6  |   9999999
                        ____________________________________________
    
"""
###########################################  code  ########################################

unit=int(input())
if unit<=100:
    amt=0
elif unit<=200:
    amt=(unit-100)*1.5
elif unit<=500:
    amt=200+(unit-200)*3
else:
    amt=350+1380+(unit-500)*6.6
print("Rs.%.2f" %amt)
