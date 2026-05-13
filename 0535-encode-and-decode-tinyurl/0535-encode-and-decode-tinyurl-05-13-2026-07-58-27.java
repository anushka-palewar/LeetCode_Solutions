public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int len=longUrl.length();
        StringBuilder sb=new StringBuilder();
        sb.append(len).append("#").append(longUrl);
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String res=new String();
        int j=0;
        while (shortUrl.charAt(j) != '#') {
            j++;
        }
        int len = Integer.parseInt(shortUrl.substring(0, j));
        return shortUrl.substring(j + 1, j + 1 + len);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));