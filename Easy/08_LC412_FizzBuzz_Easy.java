
class Solution {
    public java.util.List<String> fizzBuzz(int n) {
java.util.List<String> list = new java.util.ArrayList<>();
for (int i = 1; i <= n; i++) {
if (i % 15 == 0) {
    list.add("FizzBuzz");
    }
else if (i % 3 == 0) {
         list.add("Fizz");
         }
else if (i % 5 == 0) {
        list.add("Buzz");
        }
else {list.add(i + "");
    }
        }

        return list;
    }
}
