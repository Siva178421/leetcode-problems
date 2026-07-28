class Solution {
    public String reformatDate(String date) {
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        String[] parts = date.split(" ");

        
        String day = parts[0].substring(0, parts[0].length() - 2);
        if (day.length() == 1) {
            day = "0" + day;
        }

        
        String month = "";
        for (int i = 0; i < 12; i++) {
            if (months[i].equals(parts[1])) {
                month = String.format("%02d", i + 1);
                break;
            }
        }

        return parts[2] + "-" + month + "-" + day;
    }
}
