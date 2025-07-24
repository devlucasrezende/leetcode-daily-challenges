package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFoldersFromTheFilesystem {

    public static void main(String[] args) {
        String[] arr = {"/a/b/c","/a/b/ca","/a/b/d"};
        System.out.println(removeSubfolders(arr));
    }

    public static List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        ArrayList<String> result = new ArrayList<>();
        result.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String lastIndex = result.get(result.size() - 1);
            if (!folder[i].startsWith(lastIndex + "/")) {
                result.add(folder[i]);
            } else {
                continue;
            }
        }
        return result;
    }
}
