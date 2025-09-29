namespace Q009
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            if (rad_f.Checked)
            {
                
                lbl_gen_ans.Visible = true;
                rad_m.Checked = false;
                lbl_gen_ans.Text = "Female";

            }
            else if (rad_m.Checked)
            {
                lbl_gen_ans.Visible = true;
                rad_f.Checked = false;
                lbl_gen_ans.Text = "Male";
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lbl_gen_ans.Visible = false;
        }
    }
}