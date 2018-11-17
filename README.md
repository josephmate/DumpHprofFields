
# DumpHprofFields
Dump the fields of a class to a delimited text file so that you can leverage
text processing tools like awk, sort, uniq, etc to continue the exploration of
your heap dump.


# Inspiration 

I was exploring a memory leak at work and came across Ryan Cuprak's slides
"Exploring Java Heap Dumps" he presented at Oracle Code One 2018.
https://www.slideshare.net/rcuprak/exploring-java-heap-dumps-oracle-code-one-2018

Here he goes over how to leverage VisualVM's heap dump analyzer library to
extract information. I recommend going over his slides because it provides a
good introduction to hprof files and the overall strategy you should apply when
trying to extract data from data structures. In the slides, he provides code
for extracting Strings, ArrayLists and LinkedLists but you can extend the strategies to
apply to HashMaps, TreeMaps, etc.


