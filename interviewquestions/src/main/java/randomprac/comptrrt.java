import java.util.*;

class Studentjj{
    private int id;
    private String fname;
    private double cgpa;
    public Studentjj(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code

class Solutionhj
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Studentjj> studentList = new ArrayList<Studentjj>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Studentjj st = new Studentjj(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
Collections.sort(studentList, new Comparator<Studentjj>() {
    @Override
    public int compare(Studentjj s1, Studentjj s2){
    if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
        return Double.compare(s2.getCgpa(), s1.getCgpa());
    }
    // Compare by first name (alphabetical order)
            if (!s1.getFname().equals(s2.getFname())) {
        return s1.getFname().compareTo(s2.getFname());
    }
    // Compare by ID (ascending order)
            return Integer.compare(s1.getId(), s2.getId());
}
});
        for(Studentjj st: studentList){
            System.out.println(st.getFname());
        }
    }
}



