/*  $Id: LibMaxMaterial.java 911 2012-01-29 18:51:55Z jenetic.bytemare $
 *  =================================================================================
 *  The 3dsmax-loader.
 */
    package de.christopherstock.android.lib.io.d3ds;
    import  de.christopherstock.android.lib.ui.*;

    class LibMaxMaterial
    {
        public      String      name        = null;
        public      LibColors   color       = null;
        public      float       offsetU     = 0.0f;
        public      float       offsetV     = 0.0f;
        public      float       tilingU     = 0.0f;
        public      float       tilingV     = 0.0f;

        public LibMaxMaterial( String aName, LibColors aColor, float aOffsetU, float aOffsetV, float aTilingU, float aTilingV )
        {
            name       = aName;
            color      = aColor;
            offsetU    = aOffsetU;
            offsetV    = aOffsetV;
            tilingU    = aTilingU;
            tilingV    = aTilingV;
        }
    }
