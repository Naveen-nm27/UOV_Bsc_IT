namespace Q009
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
            this.rad_m = new System.Windows.Forms.RadioButton();
            this.rad_f = new System.Windows.Forms.RadioButton();
            this.label1 = new System.Windows.Forms.Label();
            this.lbl_gen_ans = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // rad_m
            // 
            this.rad_m.AutoSize = true;
            this.rad_m.Location = new System.Drawing.Point(16, 35);
            this.rad_m.Name = "rad_m";
            this.rad_m.Size = new System.Drawing.Size(51, 19);
            this.rad_m.TabIndex = 0;
            this.rad_m.TabStop = true;
            this.rad_m.Text = "Male";
            this.rad_m.UseVisualStyleBackColor = true;
            this.rad_m.CheckedChanged += new System.EventHandler(this.radioButton1_CheckedChanged);
            // 
            // rad_f
            // 
            this.rad_f.AutoSize = true;
            this.rad_f.Location = new System.Drawing.Point(73, 35);
            this.rad_f.Name = "rad_f";
            this.rad_f.Size = new System.Drawing.Size(63, 19);
            this.rad_f.TabIndex = 1;
            this.rad_f.TabStop = true;
            this.rad_f.Text = "Female";
            this.rad_f.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(61, 15);
            this.label1.TabIndex = 2;
            this.label1.Text = "Select one";
            // 
            // lbl_gen_ans
            // 
            this.lbl_gen_ans.AutoSize = true;
            this.lbl_gen_ans.Location = new System.Drawing.Point(91, 85);
            this.lbl_gen_ans.Name = "lbl_gen_ans";
            this.lbl_gen_ans.Size = new System.Drawing.Size(45, 15);
            this.lbl_gen_ans.TabIndex = 3;
            this.lbl_gen_ans.Text = "Gender";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(16, 86);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(51, 15);
            this.label3.TabIndex = 4;
            this.label3.Text = "Gender: ";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(152, 141);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.lbl_gen_ans);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.rad_f);
            this.Controls.Add(this.rad_m);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private RadioButton rad_m;
        private RadioButton rad_f;
        private Label label1;
        private Label lbl_gen_ans;
        private Label label3;
    }
}