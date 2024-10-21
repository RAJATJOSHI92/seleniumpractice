package objectclasses;

public class cout {
    public static void main(String[] args) {
        String str=" hello my name is rajat";
        char[] chars = str.toCharArray();
        StringBuffer bf=new StringBuffer();
      for(int i=0;i<=chars.length-1;i++)
      {
          if((chars[i] !=' ' && (chars[i] != '\t')))
          {
              bf.append(chars[i]);
          }

      }
        System.out.println(bf);
    }
}
