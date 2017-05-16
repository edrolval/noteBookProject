package notebookPack;


class Record {
    private int id;
    private static int recordCount = 0;

    Record() {
        recordCount++;
        id = recordCount;
    }

    int getId() {
        return id;
    }
}
