/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2009, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * ---------------------------------
 * BufferedImageRenderingSource.java
 * ---------------------------------
 * (C) Copyright 2009, by David Gilbert (for Object Refinery Limited).
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 06-Jul-2009 : Version 1 (DG);
 *
 */

package org.jfree.chart;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DatasetSelectionState;

/**
 * The rendering source for drawing to a buffered image.
 */
public class BufferedImageRenderingSource implements RenderingSource {

    private BufferedImage image;

    public BufferedImageRenderingSource(BufferedImage image) {
        if (image == null) {
            throw new IllegalArgumentException("Null 'image' argument.");
        }
        this.image = image;
    }

    public Graphics2D createGraphics2D() {
        return this.image.createGraphics();
    }

    public DatasetSelectionState getSelectionState(Dataset dataset) {
        if (dataset instanceof DatasetSelectionState) {
            DatasetSelectionState dss = (DatasetSelectionState) dataset;
            return dss;
            // FIXME:  later we could add a mechanism to add the selection
            // state externally
        }
        return null;
    }



}
