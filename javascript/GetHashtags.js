/* 2) Write a function that retrieves the top 3 longest words of a newspaper headline and transforms them into hashtags. 
If multiple words tie for the same length, retrieve the word that occurs first.

Examples
getHashTags("How the Avocado Became the Fruit of the Global Trade")
--> ["#avocado", "#became", "#global"]

getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year")
--> ["#christmas", "#probably", "#will"]

getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")
--> ["#surprise", "#parents", "#fruit"]

getHashTags("Visualizing Science")
--> ["#visualizing", "#science"]

Notes:
If the title is less than 3 words, just order the words in the title by length in descending order (see example #4).

Punctuation does not count towards a word's length.
*/

getHashTags("How the Avocado Became the Fruit of the Global Trade");

function getHashTags(headline) {
    //verify headline is right
    console.log("Headline: " + headline);

    //split headline into an array
    let headlineArr = headline.split(" ");
    
    //find 3 longest words
    if (headlineArr[0].length < headlineArr[1].length) {
        top.push(headlineArr[1]);
        console.log("Top 3" + top);
    }

    if (top[0].length == top[1].length) {
        console.log("Elements are of same length");
    }
    
    //compare length of index 0 and 1
    //if index 0 has a longer length, put it into the top 3 array
    //if not, put index 1 into the top 3 array

    console.log("Hashtags #" + headlineArr);
}