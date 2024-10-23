package issues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LogProcessor {

    public static List<String[]> extractErrorLogs(String[][] logs) {
        List<String[]> filteredLogs = new ArrayList<>();

        // Filter logs for ERROR or CRITICAL status
        for (String[] log : logs) {
            String status = log[2];
            if (status.equals("ERROR") || status.equals("CRITICAL")) {
                filteredLogs.add(log);
            }
        }

        // Sort the filtered logs by date and time
        Collections.sort(filteredLogs, new Comparator<String[]>() {
            @Override
            public int compare(String[] log1, String[] log2) {
                int dateCompare = log1[0].compareTo(log2[0]);
                if (dateCompare != 0) {
                    return dateCompare;
                }
                return log1[1].compareTo(log2[1]);
            }
        });

        return filteredLogs;
    }

    public static void main(String[] args) {
        String[][] logs = {
            {"01-01-2023", "14:00", "ERROR", "failed"},
            {"01-01-2023", "15:00", "INFO", "established"},
            {"01-01-2023", "01:30", "ERROR", "failed"},
            {"01-01-2022", "18:00", "CRITICAL", "failed"},
            {"01-01-2023", "16:00", "SUCCESS", "established"}
        };

        List<String[]> result = extractErrorLogs(logs);

        for (String[] log : result) {
            System.out.println(String.join(", ", log));
        }
    }
}