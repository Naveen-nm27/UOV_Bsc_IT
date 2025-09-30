namespace TrackBar
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            components = new System.ComponentModel.Container();
            progressBar1 = new ProgressBar();
            button1 = new Button();
            progressBar2 = new ProgressBar();
            progressBar3 = new ProgressBar();
            timer1 = new System.Windows.Forms.Timer(components);
            SuspendLayout();
            // 
            // progressBar1
            // 
            progressBar1.BackColor = SystemColors.ActiveCaptionText;
            progressBar1.ForeColor = Color.OrangeRed;
            progressBar1.Location = new Point(12, 97);
            progressBar1.Name = "progressBar1";
            progressBar1.Size = new Size(348, 23);
            progressBar1.TabIndex = 0;
            // 
            // button1
            // 
            button1.Font = new Font("Symbol", 18F, FontStyle.Bold, GraphicsUnit.Point, 2);
            button1.Location = new Point(12, 12);
            button1.Name = "button1";
            button1.Size = new Size(348, 66);
            button1.TabIndex = 1;
            button1.Text = "Start";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // progressBar2
            // 
            progressBar2.BackColor = SystemColors.ActiveCaptionText;
            progressBar2.ForeColor = Color.OrangeRed;
            progressBar2.Location = new Point(12, 136);
            progressBar2.Name = "progressBar2";
            progressBar2.Size = new Size(348, 23);
            progressBar2.TabIndex = 2;
            // 
            // progressBar3
            // 
            progressBar3.BackColor = SystemColors.ActiveCaptionText;
            progressBar3.ForeColor = Color.OrangeRed;
            progressBar3.Location = new Point(12, 175);
            progressBar3.Name = "progressBar3";
            progressBar3.Size = new Size(348, 23);
            progressBar3.TabIndex = 3;
            // 
            // timer1
            // 
            timer1.Tick += timer1_Tick;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 17F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(372, 225);
            Controls.Add(progressBar3);
            Controls.Add(progressBar2);
            Controls.Add(button1);
            Controls.Add(progressBar1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
        }

        #endregion

        private ProgressBar progressBar1;
        private Button button1;
        private ProgressBar progressBar2;
        private ProgressBar progressBar3;
        private System.Windows.Forms.Timer timer1;
    }
}
