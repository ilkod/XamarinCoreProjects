using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SkiaSharp;
using SkiaSharp.Views.Forms;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.PlatformConfiguration;

namespace ColorDrag
{
	[XamlCompilation(XamlCompilationOptions.Compile)]
	public partial class DrawingPage : ContentPage
	{
        SKPaint paintFill;
        float[] coord = { 0, 0, 10};
        String color_;
        Circle ccircle;


		public DrawingPage(float x, float y, float radius, String color)
		{
            InitializeComponent();



            //this.SetBinding(HomePage.TitleProperty, "x");
            //this.SetBinding(HomePage.TitleProperty, "y");
            //this.SetBinding(HomePage.TitleProperty, "radius");
            //this.SetBinding(HomePage.TitleProperty, "color");

            coord[0] = x;
            coord[1] = y;
            coord[2] = radius;
            color_ = "Black";



            paintFill = new SKPaint
            {
                Style = SKPaintStyle.Fill,
                Color = SKColors.Tomato
            };

            
            canvasView.PaintSurface += canvasView_PaintSurface;
		}

        private void canvasView_PaintSurface(object sender, SkiaSharp.Views.Forms.SKPaintSurfaceEventArgs e)
        { 
            

            var surface = e.Surface;
            var canvas = surface.Canvas;


            canvas.Clear(SKColors.WhiteSmoke);
            

            canvas.DrawCircle(coord[0], coord[1], coord[2], paintFill);

           // canvas.Save();

            //canvas.Restore();

        }

        
    }
}