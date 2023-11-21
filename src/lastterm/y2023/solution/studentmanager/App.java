package lastterm.y2023.solution.studentmanager;

import com2021.countrylistmanager.AbstractCountry;
import com2021.countrylistmanager.CountryData;
import com2021.countrylistmanager.CountryFactory;
import com2021.countrylistmanager.CountryListManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                Student student = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();


                StudentManager.getInstance().append(student);

                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        testOriginalData();
        testSortYearOfBirthIncreasing();
        testSortMathsGradeDecreasing();
        testSortMathsGradeIncreasing();
        testSortMathsGradeDecreasing();
        testSortPhysicsGradeIncreasing();
        testSortPhysicsGradeDecreasing();
        testSortChemistryGradeIncreasing();
        testSortChemistryGradeDecreasing();
        testFilterStudentsHighestMathsGrade();
        testFilterStudentsLowestMathsGrade();
        testFilterStudentsHighestPhysicsGrade();
        testFilterStudentsLowestPhysicsGrade();
        testFilterStudentsHighestChemistryGrade();
        testFilterStudentsLowestChemistryGrade();
        testFilterStudentsHighestAverageGrade();
        testFilterStudentsLowestAverageGrade();
    }

    public static void init() {
        String filePath = "src/hus/oop/data/students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        System.out.println("\ntestOriginalData()");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortYearOfBirthIncreasing() {
        System.out.println("\ntestSortYearOfBirthIncreasing()");
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testSortYearOfBirthDecreasing() {
        System.out.println("\ntestSortYearOfBirthDecreasing()");
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testSortMathsGradeIncreasing() {
        System.out.println("\ntestSortMathsGradeIncreasing()");
        StudentManager.print(StudentManager.getInstance().sortMathsGradeIncreasing());
        System.out.println();
    }

    public static void testSortMathsGradeDecreasing() {
        System.out.println("\ntestSortMathsGradeDecreasing()");
        StudentManager.print(StudentManager.getInstance().sortMathsGradeDecreasing());
        System.out.println();
    }

    public static void testSortPhysicsGradeIncreasing() {
        System.out.println("\ntestSortPhysicsGradeIncreasing()");
        StudentManager.print(StudentManager.getInstance().sortPhysicsGradeIncreasing());
        System.out.println();
    }

    public static void testSortPhysicsGradeDecreasing() {
        System.out.println("\ntestSortPhysicsGradeDecreasing()");
        StudentManager.print(StudentManager.getInstance().sortPhysicsGradeDecreasing());
        System.out.println();
    }

    public static void testSortChemistryGradeIncreasing() {
        System.out.println("\ntestSortChemistryGradeIncreasing()");
        StudentManager.print(StudentManager.getInstance().sortChemistryGradeIncreasing());
        System.out.println();
    }

    public static void testSortChemistryGradeDecreasing() {
        System.out.println("\ntestSortChemistryGradeDecreasing()");
        StudentManager.print(StudentManager.getInstance().sortChemistryGradeDecreasing());
        System.out.println();
    }

    public static void testFilterStudentsHighestMathsGrade() {
        System.out.println("\ntestFilterStudentsHighestMathsGrade()");
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestMathsGrade() {
        System.out.println("\ntestFilterStudentsLowestMathsGrade()");
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        List<Student> nLowestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestMathsGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestMathsGradeStudents);
        System.out.print(codeString);
        System.out.println();
    }

    public static void testFilterStudentsHighestPhysicsGrade() {
        System.out.println("\ntestFilterStudentsHighestPhysicsGrade()");
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestPhysicsGrade() {
        System.out.println("\ntestFilterStudentsLowestPhysicsGrade()");
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsHighestChemistryGrade() {
        System.out.println("\ntestFilterStudentsHighestChemistryGrade()");
        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestChemistryGrade() {
        System.out.println("\ntestFilterStudentsLowestChemistryGrade()");
        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsHighestAverageGrade() {
        System.out.println("\ntestFilterStudentsHighestAverageGrade()");
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestAverageGrade() {
        System.out.println("\ntestFilterStudentsLowestAverageGrade()");
        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }
}
