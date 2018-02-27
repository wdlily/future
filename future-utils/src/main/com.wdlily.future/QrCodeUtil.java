package com.wdlily.future;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 二维码
 * @Author: WangDi
 * @Date: 2017/11/24 14:04
 */
public class QrCodeUtil {

    public static byte[] createQRCode(String url, int qrCodewidth, int qrCodeheight) throws WriterException,
            IOException {
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();

        hints.put(EncodeHintType.MARGIN, 0);

        BitMatrix bitMatrix = new QRCodeWriter().encode(url,

                BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hints);

        // 1.1去白边

        int[] rec = bitMatrix.getEnclosingRectangle();

        int resWidth = rec[2] + 1;

        int resHeight = rec[3] + 1;

        BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);

        resMatrix.clear();

        for (int i = 0; i < resWidth; i++) {

            for (int j = 0; j < resHeight; j++) {

                if (bitMatrix.get(i + rec[0], j + rec[1])) {

                    resMatrix.set(i, j);

                }
            }
        }
        // 2

        int width = resMatrix.getWidth();

        int height = resMatrix.getHeight();

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        for (int x = 0; x < width; x++) {

            for (int y = 0; y < height; y++) {

                image.setRGB(x, y, resMatrix.get(x, y) == true ?

                        Color.BLACK.getRGB() : Color.WHITE.getRGB());
            }
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ImageIO.write(image, "png", out);
        return out.toByteArray();
    }

}
