namespace DepartmentEx
{
    partial class Department
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.t1 = new System.Windows.Forms.TextBox();
            this.t2 = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.t3 = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.t4 = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.d1 = new System.Windows.Forms.DataGridView();
            this.add = new System.Windows.Forms.Button();
            this.view = new System.Windows.Forms.Button();
            this.update = new System.Windows.Forms.Button();
            this.Delete = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.Home = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.d1)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(25, 90);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Staff ID";
            // 
            // t1
            // 
            this.t1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.t1.Location = new System.Drawing.Point(176, 90);
            this.t1.Name = "t1";
            this.t1.ReadOnly = true;
            this.t1.Size = new System.Drawing.Size(197, 26);
            this.t1.TabIndex = 1;
            // 
            // t2
            // 
            this.t2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.t2.Location = new System.Drawing.Point(176, 143);
            this.t2.Name = "t2";
            this.t2.Size = new System.Drawing.Size(197, 26);
            this.t2.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(25, 149);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(51, 20);
            this.label2.TabIndex = 2;
            this.label2.Text = "Name";
            // 
            // t3
            // 
            this.t3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.t3.Location = new System.Drawing.Point(176, 201);
            this.t3.Name = "t3";
            this.t3.Size = new System.Drawing.Size(197, 26);
            this.t3.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(25, 207);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(126, 20);
            this.label3.TabIndex = 4;
            this.label3.Text = "Employee Count";
            // 
            // t4
            // 
            this.t4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.t4.Location = new System.Drawing.Point(176, 262);
            this.t4.Name = "t4";
            this.t4.Size = new System.Drawing.Size(197, 26);
            this.t4.TabIndex = 7;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(25, 268);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(48, 20);
            this.label4.TabIndex = 6;
            this.label4.Text = "Head";
            // 
            // d1
            // 
            this.d1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.d1.Location = new System.Drawing.Point(398, 90);
            this.d1.Name = "d1";
            this.d1.Size = new System.Drawing.Size(390, 198);
            this.d1.TabIndex = 8;
            this.d1.RowHeaderMouseClick += new System.Windows.Forms.DataGridViewCellMouseEventHandler(this.d1_RowHeaderMouseClick);
            // 
            // add
            // 
            this.add.BackColor = System.Drawing.Color.DarkGreen;
            this.add.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.add.ForeColor = System.Drawing.SystemColors.Control;
            this.add.Location = new System.Drawing.Point(76, 365);
            this.add.Name = "add";
            this.add.Size = new System.Drawing.Size(94, 47);
            this.add.TabIndex = 9;
            this.add.Text = "Add";
            this.add.UseVisualStyleBackColor = false;
            this.add.Click += new System.EventHandler(this.add_Click);
            // 
            // view
            // 
            this.view.BackColor = System.Drawing.Color.DarkGreen;
            this.view.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.view.ForeColor = System.Drawing.SystemColors.Control;
            this.view.Location = new System.Drawing.Point(188, 365);
            this.view.Name = "view";
            this.view.Size = new System.Drawing.Size(89, 47);
            this.view.TabIndex = 10;
            this.view.Text = "View";
            this.view.UseVisualStyleBackColor = false;
            this.view.Click += new System.EventHandler(this.view_Click);
            // 
            // update
            // 
            this.update.BackColor = System.Drawing.Color.DarkGreen;
            this.update.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.update.ForeColor = System.Drawing.SystemColors.Control;
            this.update.Location = new System.Drawing.Point(289, 365);
            this.update.Name = "update";
            this.update.Size = new System.Drawing.Size(93, 47);
            this.update.TabIndex = 11;
            this.update.Text = "Update";
            this.update.UseVisualStyleBackColor = false;
            this.update.Click += new System.EventHandler(this.update_Click);
            // 
            // Delete
            // 
            this.Delete.BackColor = System.Drawing.Color.DarkGreen;
            this.Delete.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Delete.ForeColor = System.Drawing.SystemColors.Control;
            this.Delete.Location = new System.Drawing.Point(394, 365);
            this.Delete.Name = "Delete";
            this.Delete.Size = new System.Drawing.Size(92, 47);
            this.Delete.TabIndex = 12;
            this.Delete.Text = "Delete";
            this.Delete.UseVisualStyleBackColor = false;
            this.Delete.Click += new System.EventHandler(this.Delete_Click);
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.DarkGreen;
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.ForeColor = System.Drawing.SystemColors.Control;
            this.button1.Location = new System.Drawing.Point(505, 365);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(96, 47);
            this.button1.TabIndex = 14;
            this.button1.Text = "Clear";
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Home
            // 
            this.Home.BackColor = System.Drawing.Color.DarkGreen;
            this.Home.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Home.ForeColor = System.Drawing.SystemColors.Control;
            this.Home.Location = new System.Drawing.Point(632, 365);
            this.Home.Name = "Home";
            this.Home.Size = new System.Drawing.Size(89, 47);
            this.Home.TabIndex = 37;
            this.Home.Text = "Home";
            this.Home.UseVisualStyleBackColor = false;
            this.Home.Click += new System.EventHandler(this.Home_Click);
            // 
            // Department
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.PaleGreen;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.Home);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.Delete);
            this.Controls.Add(this.update);
            this.Controls.Add(this.view);
            this.Controls.Add(this.add);
            this.Controls.Add(this.d1);
            this.Controls.Add(this.t4);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.t3);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.t2);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.t1);
            this.Controls.Add(this.label1);
            this.Name = "Department";
            this.Text = "Department";
            this.Load += new System.EventHandler(this.Department_Load);
            ((System.ComponentModel.ISupportInitialize)(this.d1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox t1;
        private System.Windows.Forms.TextBox t2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox t3;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox t4;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.DataGridView d1;
        private System.Windows.Forms.Button add;
        private System.Windows.Forms.Button view;
        private System.Windows.Forms.Button update;
        private System.Windows.Forms.Button Delete;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button Home;
    }
}