using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ColorDrag;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace ColorDrag
{
	[XamlCompilation(XamlCompilationOptions.Compile)]
	public partial class HomePage : ContentPage
	{
		public  HomePage ()
		{
			InitializeComponent ();

            button1.Clicked += OnNavigateButtonClicked;// (sender, e) =>
            //{
                //float x = (float)Convert.ToDouble(entryX.Text);
                //float y = (float)Convert.ToInt32(entryY.Text);
                //float radius = (float)Convert.ToDouble(entryRadius.Text);
                //String color = Convert.ToString(entryColor.Text);

                //Circle circle = new Circle(x, y,radius, color);
                //Navigation.PushAsync(new DrawingPage());//(x, y, radius, color));

                
           // };

            async void OnNavigateButtonClicked(object sender, EventArgs e)
            {
               var circle_ = new Circle((float)Convert.ToDouble(entryX.Text), (float)Convert.ToDouble(entryY.Text),
                    (float)Convert.ToDouble(entryRadius.Text), Convert.ToString(entryColor.Text));

                var x = (float)Convert.ToDouble(entryX.Text);
                var y = (float)Convert.ToDouble(entryY.Text);
                var radius = (float)Convert.ToDouble(entryRadius.Text);
                String color =   Convert.ToString(entryColor.Text);

                var drawingPage = new DrawingPage(x, y, radius, color);

                drawingPage.BindingContext = circle_;
                //drawingPage.BindingContext = x;
                //drawingPage.BindingContext = y;
                //drawingPage.BindingContext = radius;
                //drawingPage.BindingContext = color;
                await Navigation.PushAsync(drawingPage);
            }
        }



        
	}
}