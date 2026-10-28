package s104_n1_e01_biblioteca;

public record Book(String title) {
    public Book(String title) {
        validateNullTitle(title);
        this.title = trimTitle(title);
    }

    private void validateNullTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title must not be null or blank");
        }
    }

    private String trimTitle(String title) {
        return title.trim();
    }
}