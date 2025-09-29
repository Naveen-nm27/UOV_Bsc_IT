Math object methods
The Math object is used for performing mathematical tasks. All Math properties and methods are static, so you call them directly on the Math object. 
Key methods of the Math object include:
Math.abs(x): Returns the absolute value of x.
Math.round(x), Math.floor(x), Math.ceil(x): Methods for rounding numbers.
Math.random(): Generates a pseudo-random number between 0 and 1.
Math.max(x, y, ...) and Math.min(x, y, ...): Find the highest or lowest value among arguments.
Math.pow(x, y) and Math.sqrt(x): Calculate powers and square roots.
Math.PI: Provides the value of pi. 
Date object methods
The Date object allows you to work with dates and times. You create a Date object using new Date() and then utilize its methods. 
Get methods (retrieve information)
These methods retrieve specific parts of a date:
getFullYear(): Gets the four-digit year.
getMonth(): Gets the month (0-11).
getDate(): Gets the day of the month.
getDay(): Gets the day of the week (0 for Sunday).
getHours(): Gets the hour (0-23).
getTime(): Gets the milliseconds since the Unix epoch. 
Set methods (change date values)
These methods modify parts of a date:
setFullYear(year), setMonth(month), setDate(day), setHours(hour): Set the year, month, day of the month, or hour for a date. 
Conversion methods
These methods convert a Date object to a string:
toDateString(): Converts the date part to a string.
toLocaleString(): Returns a localized date and time string. 
Array object methods
Arrays have built-in methods for manipulating their elements. 
Adding and removing elements
Methods for changing the size and contents of an array:
push() and unshift(): Add elements to the end or beginning of an array.
pop() and shift(): Remove elements from the end or beginning of an array.
splice(): A versatile method to add, remove, or replace elements at any index. 
Iteration and manipulation
Methods for working with the elements in an array:
forEach(): Executes a function for each element.
map(): Creates a new array from the results of calling a function on every element.
filter(): Creates a new array with elements that pass a test.
find(): Returns the first element that passes a test.
sort(): Arranges array elements.
slice(): Extracts a section into a new array. 
Other useful methods
Additional methods for arrays:
concat(): Joins arrays.
join(): Combines elements into a string.
includes(): Checks for the presence of a value. 
String methods
Strings also have methods for manipulation.
length: A property to get the length of a string.
toUpperCase() and toLowerCase(): Convert string case.
indexOf(): Finds the index of a substring.
slice(): Extracts a part of a string.
replace(): Substitutes a value with another.
split(): Divides a string into an array.
trim(): Removes leading and trailing whitespace.
charAt(): Returns the character at a specific index. 