function calculateAreaOfTriangle (array) {
    //a, b, and c are sides of the triangle
    let a = array[0];
    console.log("Side a: " + a);
    
    let b = array[1];
    console.log("Side b: " + b);
   
    let c = array[2];
    console.log("Side c: " + c);
    
     //s is for finding the semiperimeter. Formula: s = 1/2(a + b + c)
     let s = (a + b + c)/2;

     console.log("Semiperimeter: " + s);
 
     //Heron's formula: area= Math.sqrt(s(s-a)(s-b)(s-c))
     let value = s * (s-a) * (s-b) * (s-c);
     area = Math.sqrt(value);

     console.log("Heron's formula: " + area);
     return area;
}

function doesTriangleFit (arr1, arr2) { 

let areaOfArr1 = calculateAreaOfTriangle(arr1);
console.log("Area of triangle 1: " + areaOfArr1);
let areaOfArr2 = calculateAreaOfTriangle(arr2);
console.log("Area of triangle 2:" + areaOfArr2);

if (areaOfArr1 > areaOfArr2) {
    return false;
}

else if (areaOfArr2 > areaOfArr1 || areaOfArr1 == areaOfArr2) {
    return true;
}

else {
    return "error";
}
}

doesTriangleFit([1, 1, 1], [1, 1, 1]);
doesTriangleFit([1, 1, 1], [2, 2, 2]);

//doesn't work for this case... not sure why
doesTriangleFit([1, 2, 3], [1, 2, 2]);

doesTriangleFit([1, 2, 4], [1, 2, 6]);