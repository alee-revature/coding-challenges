#Write a program which accepts a sequence of comma separated 4 digit binary numbers as its input
#and then check whether they are divisible by 5 or not.
#The numbers that are divisible by 5 are to be printed in a comma separated sequence.

#Example:
#0100,0011,1010,1001
#Then the output should be:
#1010

#Notes: Assume the data is input by console.

#use o as prefix for binary numbers

#get number from list of numbers and iterate through the array

testData = [0o0100, 0o0011, 1010, 1001]
sequence = []

def divisibleBy5(sequence):
    for number in sequence :
        if (number % 5 == 0):
            print(number)

divisibleBy5(testData)

#user input sequence
#loop to accept 4 digit binary numbers as input

for i in range (0,4):
    num = int(input("Enter a number: "))
    #append to list sequence
    sequence.append(num)
    
divisibleBy5(sequence)


#need to treat as binary numbers
     


