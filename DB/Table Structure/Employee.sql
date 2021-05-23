USE [HRSchema]
GO

/****** Object:  Table [dbo].[Employee]    Script Date: 7/17/2018 10:49:13 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Employee](
	[employeeID] [int] NOT NULL,
	[employeeName] [nvarchar](max) NOT NULL,
	[FK_FunctionalClass] [int] NOT NULL,
	[employeeFullName] [nvarchar](max) NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[employeeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

ALTER TABLE [dbo].[Employee]  WITH CHECK ADD  CONSTRAINT [FK_Employee_FunctionalClasses] FOREIGN KEY([FK_FunctionalClass])
REFERENCES [dbo].[FunctionalClasses] ([ID])
GO

ALTER TABLE [dbo].[Employee] CHECK CONSTRAINT [FK_Employee_FunctionalClasses]
GO

