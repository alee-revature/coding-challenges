#Write a program which accepts a sequence of comma separated 4 digit binary numbers as its input
#and then check whether they are divisible by 5 or not.
#The numbers that are divisible by 5 are to be printed in a comma separated sequence.

#Example:
#0100,0011,1010,1001
#Then the output should be:
#1010

#Notes: Assume the data is input by console.

#use o as prefix for binary numbers
numbers = [0o100, 0o011, 1010, 1001]
#get number from list of numbers and iterate through the array



def divisibleBy5(number):

    #if number is divisible by 5, print the number
    if (number % 5 == 0):
        print(number)
    elif (number % 5 != 0):
        output = "not divisible by 5"
        print(output)
    else:
        output = "error. please try again"
        print(output)

divisibleBy5(0o100)
divisibleBy5(0o011)
divisibleBy5(1010)
divisibleBy5(1001)

number = int(input("Enter a number: "))
divisibleBy5(number)


#left to do: need to make this function work for sequences and loop through indeces
