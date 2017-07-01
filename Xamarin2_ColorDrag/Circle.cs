using System;
using System.Collections.Generic;
using System.Text;
using System.Drawing;
namespace ColorDrag
{
    class Circle
    {
        float x { get; set; }
        float y { get; set; }
        float radius { get; set; }
        String color { get; set; }



        public Circle(float x, float y, float radius, String color) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.color = color;
        }

        public Circle()
        {
        }
    }
}
