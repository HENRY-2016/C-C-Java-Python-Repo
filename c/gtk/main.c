
#include <gtk/gtk.h>

static void activate (GtkApplication* app, gpointer user_data)
{
    GtkWidget *window;
    window = gtk_application_window_new (app);
    gtk_window_set_title (GTK_WINDOW (window),"Bake4me");
    gtk_window_set_default_size(GTK_WINDOW(window), 500,500);
    gtk_widget_show_all (window);
}

int main (int argc, char **argv)
{
    GtkApplication *app;
    int status;
    
    app = gtk_application_new("org.gtk.example", G_APPLICATION_FLAGS_NONE);
    g_signal_connect(app,"activate",G_CALLBACK(activate),NULL);
    status = g_application_run (G_APPLICATION (app), argc, argv);
    g_object_unref (app);
    return status;
}


/*

5

C is case-sensitive. The name of the type is GtkWidget:

GtkWidget *window;

In general GTK+ types have a Gtk prefix, while the macros have GTK, this is a common naming scheme in C.

*/