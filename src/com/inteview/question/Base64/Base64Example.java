package com.inteview.question.Base64;

import sun.security.provider.MD5;

import java.security.MessageDigest;
import java.util.Base64;

public class Base64Example {

    public static void main (String []a)
    {

        try{

            String yourString = "We can compute a unique hash (e.g., MD5 or SHA256, etc.) of the given URL. The hash can then be encoded for displaying. This encoding could be base36 ([a-z ,0-9]) or base62 ([A-Z, a-z, 0-9]) and if we add ‘-’ and ‘.’ we can use base64 encoding. A reasonable question would be, what should be the length of the short key? 6, 8 or 10 characters.\n" +
                    "\n" +
                    "Using base64 encoding, a 6 letter long key would result in 64^6 = ~68.7 billion possible strings\n" +
                    "Using base64 encoding, an 8 letter long key would result in 64^8 = ~281 trillion possible strings\n" +
                    "\n" +

                    "\n" +
                    "If we use the MD5 algorithm as our hash function, it’ll produce a 128-bit hash value. After base64 encoding, we’ll get a string having more than 21 characters (since each base64 character encodes 6 bits of the hash value). Since we only have space for 8 characters per short key, how will we choose our key then? We can take the first 6 (or 8) letters for the key. This could result in key duplication though, upon which we can choose some other characters out of the encoding string or swap some characters.\n" +
                    "\n" +
                    "What are different issues with our solution? We have the following couple of problems with our encoding scheme:\n" +
                    "\n" +
                    "If multiple users enter the same URL, they can get the same shortened URL, which is not acceptable.\n" +
                    "What if parts of the URL are URL-encoded? e.g., http://www.educative.io/distributed.php?id=design, and http://www.educative.io/distributed.php%3Fid%3Ddesign are identical except for the URL encoding.\n" +
                    "Workaround for the issues: We can append an increasing sequence number to each input URL to make it unique, and then generate a hash of it. We don’t need to store this sequence number in the databases, though. Possible problems with this approach could be an ever-increasing sequence number. Can it overflow? Appending an increasing sequence number will also impact the performance of the service.\n" +
                    "\n" +
                    "Another solution could be to append user id (which should be unique) to the input URL. However, if the user has not signed in, we would have to ask the user to choose a uniqueness key. Even after this, if we have a conflict, we have to keep generating a key until we get a unique one.oded? e.g., http://www.educative.io/distributed.php?id=design, and http://www.educative.io/distributed.php%3Fid%3Ddesign are identical except for the URL encoding.\n" +
                    "Workaround for the issues: We can append an increasing sequence number to each input URL to make it unique, and then generate a hash of it. We don’t need to store this sequence number in the databases, though. Possible problems with this approach could be an ever-increasing sequence number. Can it overflow? Appending an increasing sequence number will also impact the performance of the service.\n" +
                    "\n" +
                    "Another solution could be to append user id (which should be unique) to the input URL. However, if the user has not signed in, we would have to ask the user to choose a uniqueness key. Even after this, if we have a conflict, we have to keep generating a key until we get a unique one.";

            byte[] bytesOfMessage = yourString.getBytes("UTF-8");

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(bytesOfMessage);

            System.out.println(thedigest);

            String re = Base64.getEncoder().encodeToString(thedigest);

            System.out.println(re);



        }catch (Exception e)
        {
            System.out.println("Exception occurred");
        }


    }

//[B@610455d6


    public static String stringToBinary(String text)
    {
        String bString="";
        String temp="";
        for(int i=0;i<text.length();i++)
        {
            temp=Integer.toBinaryString(text.charAt(i));
            for(int j=temp.length();j<8;j++)
            {
                temp="0"+temp;
            }
            bString+=temp;
        }

        System.out.println(bString);
        return bString;
    }
    public static String BinaryToString(String binaryCode)
    {
        String[] code = binaryCode.split(" ");
        String word="";
        for(int i=0;i<code.length;i++)
        {
            word+= (char)Integer.parseInt(code[i],2);
        }
        System.out.println(word);
        return word;
    }


}


