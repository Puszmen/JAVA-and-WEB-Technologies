package pl.javastart.paintcalc;

public class PaintCalculator {
    static final int SQM_TO_SQCM = 10_000;

    static int calculatePaintAmount(Room room, PaintDetails paintDetails) {
        int areaToPaint = room.getPaintArea();
        int coverage = paintDetails.getCoverage() * SQM_TO_SQCM;
        int singleCoatLiters = areaToPaint / coverage;
        int multipleCoatLiters = singleCoatLiters * paintDetails.getCoats();
        return multipleCoatLiters;
    }
}
