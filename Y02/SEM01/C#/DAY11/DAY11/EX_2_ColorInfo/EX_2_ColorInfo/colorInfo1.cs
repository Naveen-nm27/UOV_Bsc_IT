using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EX_2_ColorInfo
{
    public class ColorInfo1
    {
        int red,green, blue;
        public ColorInfo1(int R,int G,int B)
        {
            this.red = R;
            this.blue = B;
            this.green = G;
        }

        public void setRed(int value) {
            this.red = Math.Max(0, Math.Min(255, value));

        }

        public void setGreen(int value) {
            this.green = Math.Max(0, Math.Min(255, value));
        }
        
        public void setBlue(int value) {
            this.red = Math.Max(0, Math.Min(255, value));
        }

        public int getRed() { 
            return red;
        }

        public int getGreen() { 
            return green;
        }

        public int getBlue()
        {
            return blue;
        }


        public String getHexCode()
        {
            return $"{red:X2}{green:X2}{blue:X2}";
        }
        public String getHexCode(bool includeHash)
        {
            return includeHash ? $"{red:X2}{green:X2}{blue:X2}" : $"{red:X2}{green:X2}{blue:X2}";
        }

        public override string ToString()
        {
            return $"RGB({red},{green},{blue}) - Hex: {getHexCode(true)}";
        }
    }
}
