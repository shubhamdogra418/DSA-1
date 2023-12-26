import java.util.ArrayList;

public class revString {
//344. Reverse String

    static void revStr (char str[]) {
        int first=0;
        int last=str.length-1;
        while (first <= last) {
            char temp=str[first];
            str[first] =str[last];
            str[last]=temp;
            first++;
            last--;
        }
    }
//345. Reverse Vowels of a String

    static String revVowels (String s) {
        ArrayList <Character> list= new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        char ch[]=s.toCharArray();
        int first=0;
        int last=ch.length-1;
        while (first <= last) {
            if(!list.contains(ch[first])) {
                first++;
            } 
            if(!list.contains(ch[last])) {
                last--;
            }
            char temp=ch[first];
            ch[first]=ch[last];
            ch[last]=temp;
            first++;
            last--;
        } return new String (ch);
    }
 //reverse vowels without list
    static String reverseVowels (String s) {
        char arr[]=s.toCharArray();
        int first=0;
        int last=arr.length-1;
        while( first < last) {
            if(!isVowel(arr[first])) {
                first++;
            } else if(!isVowel(arr[last])) {
                last--;
            } else {
                char temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
                first++;
                last--;
            }
        } return new String(arr);
    }
    static boolean isVowel (char arr) {
        if(arr=='a' || arr=='e' || arr=='i' || arr=='o' || arr=='u' || 
        arr=='A' || arr=='I' || arr=='E' || arr=='U' || arr=='O' ) {
            return true;
        } return false;
    }


    public static void main(String[] args) {
        char str[]={'h','e','l','l','o'};
        // revStr(str);
        // for(int i=0;i<str.length;i++) {
        //     System.out.print(str[i]+" ");
        // }
        String s="hello";
        // System.out.println(revVowels(s));
        System.out.println(reverseVowels(s));
        
    }
}
