class Solution {
    public java.util.List<String> fullJustify(String[] words, int maxWidth) {
java.util.List<String> result = new java.util.ArrayList<>();
int i = 0;
while (i < words.length) {
int j = i;
int letters = 0;
while (j < words.length &&
letters + words[j].length() + j - i <= maxWidth) {
letters += words[j].length();
j++;
            }

int spaces = maxWidth - letters;
int gaps = j - i - 1;
String line = "";

if (j == words.length || gaps == 0) {
for (int k = i; k < j; k++) {
line += words[k];

if (k < j - 1) line += " ";
                }

while (line.length() < maxWidth) {
                    line += " ";
                }
            }
else {
int each = spaces / gaps;
int extra = spaces % gaps;

for (int k = i; k < j - 1; k++) {
line += words[k];

int count = each;

if (k - i < extra) count++;

for (int x = 0; x < count; x++) {
line += " ";
                    }
                }

line += words[j - 1];
            }

result.add(line);
            i = j;
        }
return result;
    }
}
