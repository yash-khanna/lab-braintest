![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | Brain Test

## A Quick Introduction




## What should you do
```
Fork this repo
Clone this repo
Practice Java basics - operators, conditions, loops, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions
Go to Java Resources -> src folder. You will have two packages src/controller and src/service.
You need to modify src/controller/PersonalityViewController and src/service/PersonalityCalculator. Do not modify the entire code. Instructions are given in comments. Edit the code as per the instructions given in the class files.

## Testing
Right click your project and run the project as run on server to see the output. 

## Formula to calculate the brain type
```  
A= (Q1)+(Q2)+(Q3)+(Q5)+(Q8)+(Q10)+(Q11)+(Q12)+(Q14)+(Q18)+(Q20) = _____
  
B = (Q4) +(Q6)+(Q7) + (Q9) + (Q13) + (Q15) + (Q16) +(Q17)+ (Q19)  = _____ 
            

* X = 66 - _A_ + _B_ =

X is your final score. It should be between 20 and 100. Higher scores indicate more 
right-brained thinking. Lower scores indicate left-brained thinking. If you want to 
categorize yourself, you can use the table below. 

Range Results:
20-55 Left-brained 
56-64 No clear preference 
65-100 Right-brained

```

## Progression - 1
Your task is to complete the find answer method.
use split method to partition the options into a string array.
use comma as the delimiter in the split method
Covert the string array into integer array
return the integer array to findYourBrainType
Change the return value of null to the integer array type


## Progression - 2
Call the findAnswers method to convert the options into an integer array 
Calculate whether your brain is right, left or well balanced based on the formula given above
You must return an integer rightbrained, leftbrained or noclearpreference
Change the return value 

