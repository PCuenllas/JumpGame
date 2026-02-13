import java.util.ArrayList;
import java.util.List;

class LevelSetUp {
    private List<List<HorizontalLine>> levels;
    private List<List<VerticalLine>> verticals;
    private List<List<DiagonalLineR>> diagonalsR;
    private List<List<DiagonalLineL>> diagonalsL;
    private int currentLevel;
    private List<HorizontalLine> horizontalLines;
    private List<VerticalLine> verticalLines;
    private List<DiagonalLineR> diagonalLinesR;
    private List<DiagonalLineL> diagonalLinesL;

    public LevelSetUp(List<HorizontalLine> horizontalLines, List<VerticalLine> verticalLines, List<DiagonalLineR> diagonalLinesR, List<DiagonalLineL> diagonalLinesL) {
        levels = new ArrayList<>();
        verticals = new ArrayList<>();
        diagonalsR = new ArrayList<>();
        diagonalsL = new ArrayList<>();
        currentLevel = 0;

        this.horizontalLines = horizontalLines;
        this.verticalLines = verticalLines;
        this.diagonalLinesR = diagonalLinesR;
        this.diagonalLinesL = diagonalLinesL;
    }

    public void addLevel(List<HorizontalLine> horizontalLines, List<VerticalLine> verticalLines, List<DiagonalLineR> diagonalLinesR, List<DiagonalLineL> diagonalLinesL) {
        levels.add(new ArrayList<>(horizontalLines));
        verticals.add(new ArrayList<>(verticalLines));
        diagonalsR.add(new ArrayList<>(diagonalLinesR));
        diagonalsL.add(new ArrayList<>(diagonalLinesL));
    }

    public void loadLevel(int levelI) {
        horizontalLines.clear();
        horizontalLines.addAll(levels.get(levelI));
        verticalLines.clear();
        verticalLines.addAll(verticals.get(levelI));
        diagonalLinesR.clear();
        diagonalLinesR.addAll(diagonalsR.get(levelI));
        diagonalLinesL.clear();
        diagonalLinesL.addAll(diagonalsL.get(levelI));
    }
    public void nextLevel() {
        currentLevel++;
        if (currentLevel >= levels.size()) {
            currentLevel = 0; // Loop back to the first level
        }
        loadLevel(currentLevel);
    }

    public void previousLevel(){
        currentLevel--;
        if (currentLevel < 0) {
            currentLevel = levels.size() - 1; // Go to the last level
        }
        loadLevel(currentLevel);
    }
}
